// TODO: Make sure to make this class a part of the synthesizer package
package synthesizer;

//Make sure this class is public
public class GuitarString {
    /** Constants. Do not change. In case you're curious, the keyword final means
     * the values cannot be changed at runtime. We'll discuss this and other topics
     * in lecture on Friday. */
    private static final int SR = 44100;      // Sampling Rate
    private static final double DECAY = .996; // energy decay factor

    /* Buffer for storing sound data. */
    private BoundedQueue buffer;

    /* Create a guitar string of the given frequency.  */
    public GuitarString(double frequency) {
        // TODO: Create a buffer with capacity = SR / frequency. You'll need to
        //       cast the result of this divsion operation into an int. For better
        //       accuracy, use the Math.round() function before casting.
        //       Your buffer should be initially filled with zeros.
        int cap = (int) Math.round(SR / frequency);
        buffer = new ArrayRingBuffer(cap);
        while (!buffer.isFull()) {
            buffer.enqueue(0.0);
        }
    }


    /* Pluck the guitar string by replacing the buffer with white noise. */
    public void pluck() {
        // TODO: Dequeue everything in the buffer, and replace it with random numbers
        //       between -0.5 and 0.5. You can get such a number by using:
        //       double r = Math.random() - 0.5;
        //
        
        while (!buffer.isEmpty()) {
            buffer.dequeue();
        }
        //       Make sure that your random numbers are different from each other.
        double[] withoutSameRandomNumber = new double[buffer.capacity()];
        int count = 0;
        boolean isSame = false;
        
        while (count < (withoutSameRandomNumber.length - 1)) {
            double r = Math.random() - 0.5;
            for (int i = 0; i < withoutSameRandomNumber.length - 1; i += 1) {
                if (r == withoutSameRandomNumber[i]) {
                    isSame = true;
                    break; // Back to the origin of r to create a new number.
                }
            }
            // After isSame check, we can enqueue this one into the buffer.
            if (! isSame) {
                withoutSameRandomNumber[count] = r;
                count += 1;
                buffer.enqueue(r);
            }
        }
    }

    /* Advance the simulation one time step by performing one iteration of
     * the Karplus-Strong algorithm. 
     */
    public void tic() {
        // TODO: Dequeue the front sample and enqueue a new sample that is
        //       the average of the two multiplied by the DECAY factor.
        //       Do not call StdAudio.play().
        double front = buffer.dequeue();
        double nextToFront = buffer.peek();
        double enqueueIntoBuffer = DECAY * ((front + nextToFront) / 2);
        buffer.enqueue(enqueueIntoBuffer);
    }

    /* Return the double at the front of the buffer. */
    public double sample() {
        // TODO: Return the correct thing.
        return buffer.peek();
    }
}
