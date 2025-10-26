
public class Book <T> {
    private int id;
    private String title;
    private String author;
    private int count;
    private T[] array;
    
    public Book() {
        array = (T[]) new Object[5];
        count = 0;
    }// end of default cons

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }// end of over loaded cons

    public int getId() {
        return id;
    }// end of get id 

    public void setId(int id) {
        this.id = id;
    }// end of set id

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }// end of get title

    public String getAuthor() {
        return author;
    }// end of get author

    public void setAuthor(String author) {
        this.author = author;
    }// end of set author

    public void checkCapacity() {
        if (count == array.length) {
            T[] newarray = (T[]) new Object[count * 2];
            for (int i = 0; i < array.length; i++) {
                newarray[i] = array[i];
            }// end of for loop
            array = newarray;
        }// end of if block
    }// end of method

    public void addBook(Book item) {
        checkCapacity();
        array[count] = (T) item;
        count++;
    }// end of add book

    public void removeBook(int position) {
    	if(isEmpty()) {
    		System.out.println("Your list is Empty you can not Remove any thing");
    	}//end if block
        if (position >= 0 && position <= count) {
            for (int i = position; i < count - 1; i++) {
                array[i] = array[i + 1];
            }// end of for loop
            count--;
        }// end of if block
    }// end of method

    public T replaceBook(int position, Book item) {
    	if(isEmpty()) {
    		System.out.println("Your list is Empty you can not Replace any thing");
    	}//end if block
    	
    		if (position >= 0 && position <= count) {
                return array[position] = (T) item;
            }// end of if block
            return null;
    	}// end of else block
        
    public int searchBook(int id2) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(id2)) {
                return i;
            }// end of if block
        }// end of for loop
        return -1;
    }// end of method 
    public int totalBooks(){
        return count;
    }// end of total book
    public void print(){
    	if(isEmpty()) {
    		System.out.println("Your list is Empty you can not print any thing");
    	}//end if block
    	else {
    		 System.out.println("List of Book is :");
    	        for (int i=0;i<count;i++){
    	            System.out.println("Book Id No is :"+ ((Book) array[i]).getId());
    	            System.out.println("Book Title  is :"+ ((Book) array[i]).getTitle());
    	            System.out.println("Book Author is :"+ ((Book) array[i]).getAuthor());
                    System.out.println();
    	        }// end of else block
    	}//end of else block
       
    }
    
    public boolean isEmpty() {
    	return count==0;
    }//end of  method

}// end of class
