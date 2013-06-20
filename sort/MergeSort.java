
/**
 * 自顶向下归并排序
 * @author agileluo
 *
 */
public class MergeSort {
	public static void main(String[] args) {
		String[] a = In.readStrings();
		SortUtils.show(a);
		MergeSort.sort(a);
		assert SortUtils.isSorted(a);
		SortUtils.show(a);
	}
	private static Comparable[] aux;
	
	public static void sort(String[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if( hi <= lo ) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge(a, lo, mid, hi);
	}

	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		for(int i = lo; i <= hi; i++){
			aux[i] = a[i];
		}
		int loIndex = lo;
		int hiIndex = mid + 1;
		for(int k = lo; k <= hi; k++){
			if( loIndex > mid ) a[k] = aux[hiIndex++];
			else if (hiIndex > hi) a[k] = aux[loIndex++];
			else if (SortUtils.less(aux[hiIndex], aux[loIndex])) a[k] = aux[hiIndex++];
			else a[k] = aux[loIndex++];
		}
	}
}
