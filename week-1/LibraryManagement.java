
class book{
    int bookId;
    String bookTitle;
    String bookAuthor;

    book(int bookId,
    String bookTitle,
    String bookAuthor){
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;

    }
         @Override
    public String toString() {

        return "ID: " + bookId +
               ", Title: " + bookTitle +
               ", Author: " + bookAuthor;
    }
    }

    class LinearSearch{
        public static book search(book[] books,String targetTitle){
            for(book b: books){
                if(b.bookTitle.equalsIgnoreCase(targetTitle)){
                    return b;
                }
            }
            return null;
        }
        }
        class BinarySearch{
            public static book search(book[] books,String targetTile ){
                int low=0;
                int high=books.length-1;

                while(low<=high){
                    int mid=(low+high)/2;

                    int result1=books[mid].bookTitle .compareToIgnoreCase(targetTile);
                    if(result1==0){
                        return books[mid];
                    }
                    if(result1<0){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
                return null;

            }
        }
class LibraryManagement{
    public static void main(String[] args) {

        book[] books={
            new book(101,
                     "C++",
                     "Bjarne Stroustrup"),

            new book(102,
                     "DBMS",
                     "Korth"),

            new book(103,
                     "Java",
                     "James Gosling"),

            new book(104,
                     "Python",
                     "Guido van Rossum")
        };
        book result =
            LinearSearch.search(
                books,
                "Java");

        if(result != null) {
            System.out.println("Found:" );
            System.out.println(result);
        }

         book result1 =
            BinarySearch.search(books,"Python");
             if(result1 != null) {
            System.out.println(
                "\n Binary Search Found:"
            );
            System.out.println(result1);
        }
        
    }
}

