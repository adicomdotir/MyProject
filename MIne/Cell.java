/**
*Holds the data of one cell of matrix.
*@author Pekka Pottonen, Pauli Harjumäki
*@version 1.0 (May 30, 2003)
*/
public class cell{
	//numbers 1-8 surrounding mines, 9 is mine
        public int cellStatus;
	public boolean isClicked, isMarked;
	 
/**
*Constructor of the cell. Sets class variables to default values.
*/
        cell(){
            this.cellStatus = 0;
            this.isClicked = false;
            this.isMarked = false;
        }

/**
*Returns the cellStatus of the cell.
*@return integer value indicating cellStatus.
*/

        public int getCell() { return cellStatus; }

/**
*Returns boolean value, whether the cell has been clicked.
*@return boolean value indicating whether the cell has been clicked.
*/
        public boolean getisClicked() { return isClicked; }

/**
*Returns boolean value, whether the cell has been marked.
*@return boolean value indicating whether the cell has been marked.
*/
      public boolean getisMarked() { return isMarked; }
        
/**
*Sets the value of the variable isClicked to a given boolean value.
*@param newstatus boolean value.
*/
        public void setisClicked(boolean newstatus){ 
	  this.isClicked = newstatus; 
	}
/**
*Sets the value of the variable isMarked to a given boolean value.
*@param mark boolean value.
*/
        public void setisMarked(boolean mark){ 
	  this.isMarked = mark; 
	}
}



