
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int numbers = size*size;

        int row = 0;
        int col = size/2;
        int curr_Row;
        int curr_Col;

        for (int i =1; i <= numbers; i++) {
            square.placeValue(col,row,i);
            curr_Row = row;
            curr_Col = col;
            row --;
            col++;
            if(row == -1) {
                row = square.getWidth()-1;
            }
            if(col == square.getHeight()) {
                col = 0;
            }
            if (square.readValue(col,row) != 0) {
                row = curr_Row +1;
                col = curr_Col;
                if(row < 0) {
                    row = square.getWidth()-1;
                }
            }
        }
        return square;
    }

}
