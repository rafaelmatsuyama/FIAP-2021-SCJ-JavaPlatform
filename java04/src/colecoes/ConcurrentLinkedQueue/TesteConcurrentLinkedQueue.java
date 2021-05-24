package colecoes.ConcurrentLinkedQueue;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TesteConcurrentLinkedQueue {

	public static void main(String[] args) {

		ConcurrentLinkedQueue<String> collection = new ConcurrentLinkedQueue<String>();

		collection.add("Info 1");
		collection.add("Info 2");
		collection.add("Info 3");
		collection.add("Info 4");
		collection.add("Info 5");

		for (Iterator<String> itr = collection.iterator(); itr.hasNext();) {
			if (itr.next().equals("Info 4"))
				collection.add("Info 6");
		}

		System.out.println(collection.contains("Info 6"));

		for (String s : collection)
			System.out.println(s);
	}
}
