/**
 * 自底向上归并排序
 * 
 * @author agileluo
 * 
 */
public class MergeBUSort {
	public static void main(String[] args) {
		String[] a = In.readStrings();
		SortExample.show(a);
		MergeBUSort.sort(a);
		assert SortExample.isSorted(a);
		SortExample.show(a);
	}

	private static Comparable[] aux;

	public static void sort(String[] a) {
		aux = new Comparable[a.length];
		int N = a.length;
		for (int size = 1; size < N; size += size) {
			for (int i = 0; i < N - size; i += size + size) {
				merge(a, i, i + size - 1, Math.min(i + size + size - 1, N - 1));
			}
		}
	}

	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		for (int i = lo; i <= hi; i++) {
			aux[i] = a[i];
		}
		int loIndex = lo;
		int hiIndex = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (loIndex > mid)
				a[k] = aux[hiIndex++];
			else if (hiIndex > hi)
				a[k] = aux[loIndex++];
			else if (SortExample.less(aux[hiIndex], aux[loIndex]))
				a[k] = aux[hiIndex++];
			else
				a[k] = aux[loIndex++];
		}
	}
}
