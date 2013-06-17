/**
 * 快速排序算法
 * @author agileluo
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		String[] a = In.readStrings();
		SortExample.show(a);
		sort(a);
		assert SortExample.isSorted(a);
		SortExample.show(a);
	}
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length-1);
	}
	private static void sort(Comparable[] a, int lo, int hi) {
		if( hi <= lo ) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j + 1, hi);
	}
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		Comparable v = a[lo];
		while(true){
			while(SortExample.less(a[++i], v)) if( i == hi) break;
			while(SortExample.less(v, a[--j])) if( j == lo) break;
			if( i >= j) break;
			SortExample.exch(a, i, j);
		}
		SortExample.exch(a, lo, j);
		return j;
	}
}
