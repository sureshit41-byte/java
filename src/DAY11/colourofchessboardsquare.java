package DAY11;

public class colourofchessboardsquare {
    public boolean squareIsWhite(String coordinates) {

        char column = coordinates.charAt(0);
        char row = coordinates.charAt(1);

        int col = 0;

        if (column == 'a') col = 1;
        else if (column == 'b') col = 2;
        else if (column == 'c') col = 3;
        else if (column == 'd') col = 4;
        else if (column == 'e') col = 5;
        else if (column == 'f') col = 6;
        else if (column == 'g') col = 7;
        else if (column == 'h') col = 8;

        int r = row - '0';

        int sum = col + r;

        if (sum % 2 == 0)
            return false;
        else
            return true;
    }
}