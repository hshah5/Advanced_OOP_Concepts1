public class BingoChip <C,R> {
    private C column;
    private R row;

    public BingoChip (C col, R row){
        this.column = col;
        this.row = row;
    }

    public String toString () {
        return "chip: " + column.toString() + row.toString();
    }

}

