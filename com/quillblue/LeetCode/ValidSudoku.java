package com.quillblue.LeetCode;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Boolean[][] horizonal=new Boolean[9][9];
        Boolean[][] verticle=new Boolean[9][9];
        Boolean[][] square=new Boolean[9][9];
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		horizonal[i][j]=false;
        		verticle[i][j]=false;
        		square[i][j]=false;
        	}	
        }
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if (board[i][j]!='.'){
        			int value=board[i][j]-'1';
        			if(horizonal[i][value]){return false;}
        			else{horizonal[i][value]=true;}
        			if(verticle[j][value]){return false;}
        			else{verticle[j][value]=true;}
        			int squareNumber=(int)(i/3)*3+(int)j/3;
        			if(square[squareNumber][value]){return false;}
        			else{square[squareNumber][value]=true;}
        		}
        	}
        }
        return true;
    }
}