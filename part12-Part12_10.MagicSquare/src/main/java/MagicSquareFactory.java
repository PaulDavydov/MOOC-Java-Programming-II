
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int numbers = size*size;
        int i = 1;
        int row = 0;
        int col = size/2;
        int curr_Row;
        int curr_Col;
        while (i<=numbers) {
            square.placeValue(row,col,i);
            curr_Row = row;
            curr_Col = col;
            row -= 1;
            col += 1;
            if (row == -1) {
                row = size -1;
            }
            if(col == size) {
                col = 0;
            }
            if (square.readValue(row,col) != 0) {
                row = curr_Row +1;
                col = curr_Col;
                if (row == -1) {
                    row = size - 1;
                }
            }
        }
        return square;
    }

}
