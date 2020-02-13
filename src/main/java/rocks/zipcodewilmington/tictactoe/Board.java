package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] tiktacboard;
    public Board(Character[][] matrix) {
        tiktacboard = matrix;
    }

    public Boolean firstColumnChecker(Character[][] input, Character player){
        Boolean ans = false;
        if(input[0][0] == player && input[1][0].equals(player) && input[2][0].equals(player)){
            ans = true;
        }

        return ans;
    }

    public Boolean secondColumnChecker(Character[][] input, Character player){
        Boolean ans = false;
        if(input[0][1].equals(player) && input[1][1].equals(player) && input[2][1].equals(player)){
            ans = true;
        }

        return ans;
    }

    public Boolean thirdColumnChecker(Character[][] input, Character player){
        Boolean ans = false;
        if(input[0][2].equals(player) && input[1][2].equals(player) && input[2][2].equals(player)){
            ans = true;
        }

        return ans;
    }



    public Boolean diagonalTopRightToBotLeftRowChecker(Character[][] input, Character player){
        Boolean ans = false;

            if (input[0][2].equals(player) && input[1][1].equals(player) && input[2][0].equals(player)) {

                ans = true;
            }

        return ans;
    }

    public Boolean diagonalTopLeftToBotRightRowChecker(Character[][] input, Character player){
        Boolean ans = false;

            if (input[0][0].equals(player) && input[1][1].equals(player) && input[2][2].equals(player)) {
                ans = true;
            }
        return ans;
    }

    public Boolean topRowChecker(Character[][] input, Character player){
        Boolean ans = false;


            if (input[0][0].equals(player) && input[0][1].equals(player) && input[0][2].equals(player)) {
                ans = true;

            }
       return ans;
    }

    public Boolean middleRowChecker(Character[][] input, Character player){
      Boolean ans = false;
            if(input[1][0].equals(player) && input[1][1].equals(player) && input[1][2].equals(player)){
                ans=true;
            }
        return ans;
    }


    public Boolean bottomRowChecker(Character[][] input, Character player){
       Boolean ans =false;
            if(input[2][0].equals(player) && input[2][1].equals(player) && input[2][2].equals(player)){
                ans=true;
            }
        return ans;
    }

    public Boolean isInFavorOfX() {
        Boolean ans = null;
        if(topRowChecker(tiktacboard,'X') == true){
            ans=true;
        }else if(middleRowChecker(tiktacboard,'X') == true) {
            ans=true;
        } else if(bottomRowChecker(tiktacboard,'X') == true){
            ans=true;
        }else if(diagonalTopLeftToBotRightRowChecker(tiktacboard,'X')== true){
            ans=true;
        }else if( diagonalTopRightToBotLeftRowChecker(tiktacboard, 'X' )== true){
            ans =true;
        }else if(firstColumnChecker(tiktacboard,'X')){
            ans = true;
        }else if(secondColumnChecker(tiktacboard,'X')){
            ans=true;
        }else if(thirdColumnChecker(tiktacboard,'X')) {
            ans = true;
        }else {
            ans=false;
        }
        return ans;
    }

    public Boolean isInFavorOfO() {
        Boolean ans = null;
        if(topRowChecker(tiktacboard,'O') == true){
            ans=true;
        }else if(middleRowChecker(tiktacboard,'O') == true) {
            ans=true;
        } else if(bottomRowChecker(tiktacboard,'O') == true){
            ans=true;
        }else if(diagonalTopLeftToBotRightRowChecker(tiktacboard,'O')== true){
            ans=true;
        }else if( diagonalTopRightToBotLeftRowChecker(tiktacboard, 'O' )== true){
            ans =true;
        }else if(firstColumnChecker(tiktacboard,'O')){
            ans = true;
        }else if(secondColumnChecker(tiktacboard,'O')){
            ans=true;
        }else if(thirdColumnChecker(tiktacboard,'O')) {
            ans = true;
        }else {
            ans=false;
        }
        return ans;
    }

    public Boolean isTie() {
        Boolean ans = false;
        if(isInFavorOfO()==false && isInFavorOfX()==false){
            ans=true;
        }
        return ans;
    }

    public String getWinner() {
        String ans;
        if(isInFavorOfX()==true){
            ans ="X";

        }else if(isInFavorOfO() == true){
            ans="O";
        } else{
            ans ="";
        }

        return ans;
    }

}
