package rubikcube;

public class RubikSide implements Cloneable{
	private final int size;
    private int[][] values;
    public RubikSide(int size, int value){
        this.size = size;
        int[] dimension = IntStream.generate(() -> value).limit(size).toArray();
        values = IntStream.range(0, size)
                .boxed()
                .map(i -> dimension.clone())
                .toArray(int[][]::new);
    }
	
}
