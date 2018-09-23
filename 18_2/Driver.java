
/**
 * Driver for Knight's Tour
 *
 * @author Max Nova 
 * @version 1/9/2018
 */
public class Driver
{
    public static void main(String[] args)
    {
        Knights_Tour chess = new Knights_Tour();
        //Output the table
        chess.printBoard();
        //Output the number of spots visited
        System.out.println();
        System.out.print(chess.visitBoard() + " squares were visited");
    }
}
