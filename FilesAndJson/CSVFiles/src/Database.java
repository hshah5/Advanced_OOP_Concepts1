import java.io.*;
import java.util.*;

public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
        String[] lines = contents.split("\n");
        this.colNames = lines[0].split(",");
        this.data = new String[lines.length - 1][this.colNames.length];

        for (int i = 1; i < lines.length; i++) {
            String[] currentLine= lines[i].split(",");
            for(int j = 0; j < colNames.length; j++) {
                this.data[i-1][j] = currentLine[j];
            }
        }

        this.numRows = lines.length - 1;
    }
/* TODO 
This constructor should take
 the contents of a CSV file and initialize the
 memember variables of the Database class.
*/

    public String getValue(String columnName, int row) {

        int col = 0;
        for (col = 0; col < this.colNames.length && !(this.colNames[col].equals(columnName)); col++) ;
        return this.data[row][col];

    }

}