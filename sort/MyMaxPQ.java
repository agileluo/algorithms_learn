/**
 * 
 * 基于堆的优先队列(数组实现)
 * 
 * @author agileluo
 *
 * @param <Key>
 */
public class MyMaxPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	private int N = 0;

	public MyMaxPQ(int max) {
		pq = (Key[]) new Comparable[max + 1];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void insert(Key v) {
		pq[++N] = v;
		swim(N);
	}

	private void swim(int k) {
		while (k > 1 && SortExample.less(pq[k / 2], pq[k])) {
			SortExample.exch(pq, k, k / 2);
			k /= 2;
		}
	}

	public Key deleteMax() {
		Key max = pq[1];
		SortExample.exch(pq, 1, N--);
		pq[N + 1] = null;
		sink(1);
		return max;
	}

	private void sink(int k) {
		while (2 * k <= N) {
			int j = k * 2;
			if (j < N && SortExample.less(pq[j], pq[j + 1]))
				j++;
			if (!SortExample.less(pq[k], pq[j]))
				break;
			SortExample.exch(pq, k, j);
			k = j;
		}
	}
	public static void main(String[] args) {
		String[] a = In.readStrings();
		MyMaxPQ<String> mq = new MyMaxPQ<String>(a.length);
		for(String str : a){
			mq.insert(str);
		}
		for(int i = 0; i < a.length; i++){
			StdOut.print(mq.deleteMax() + " ");
		}
	}
}
