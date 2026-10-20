package PACKAGE_NAME.lms.model;


public abstract class Libaryitem {



        private String id;
        private String title;
        private boolean isBorrowed;

        public Libaryitem(String id, String title) {
            setId(id);
            setTitle(title);
            isBorrowed = false;
        }

        public String getId(){
            return id;
        }

        public String getTitle(){
            return title;
        }
        public boolean getIsBorrowed(){
            return isBorrowed;
        }


        public void setId(String id) throws IllegalArgumentException {
            if(id.trim().isEmpty()){
                throw new IllegalArgumentException("ID Cannot be Blank");

            }else{
                this.id = id;
            }
        }

        public void  setTitle(String title) throws IllegalArgumentException{
            if(title.trim().isEmpty()){
                throw new IllegalArgumentException("Title Cannot be Blank");
            }
        }

        public void borrowItem() { isBorrowed = true; }

        public void returnItem() { isBorrowed = false;}

        public double calculateLateFee(int daysLate) {
            return daysLate * 10.0;
        }

        @Override
        public String toString() {
            System.out.println("Book{Id="+id+", Title='"+title+"', Borrowed="+isBorrowed);

            return null;
        }
    }


