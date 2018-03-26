public class AltList<X, Y> {
	private X item;
	private AltList<Y, X> next;

	AltList(X item, AltList<Y, X> next) {
		this.item = item;
		this.next = next;
	}

	AltList<Integer, String> list = 
		new AltList<Integer, String> (5,
			new AltList<String, Integer> ("cat",
				new AltList<Integer, String> (10,
					new AltList<String, Integer> ("dog", null))));

	public AltList<X, Y> pairsSwapped() {
		//Assume that has an even non-zero length.
		AltList<Y, X> temp = new AltList<Y, X>(next.item, new AltList<X, Y>(item, null));
		if (next.next != null) {
			temp.next.next = next.next.pairsSwapped();
		}
		return temp;

	}
}