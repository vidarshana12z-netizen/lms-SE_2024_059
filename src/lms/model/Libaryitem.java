package PACKAGE_NAME.lms.model;

public class Libaryitem {

    public abstract class LibraryItem {
        private String id;
        private String title;
        private boolean isBorrowed;

        public LibraryItem(String id, String title) {
           this.id = id;
           this.title = title;
        }

        public void setId(String id) {

            if(id == null){
                return;
            }
            this.id = id;
        }

        // TODO: setTitle(String title) - same pattern, message "Title cannot be blank"
        public void borrowItem() { /* TODO */ }

        public void returnItem() { /* TODO */ }

        public double calculateLateFee(int daysLate) {
            // TODO: return daysLate * 10.0 (the default rate)
            return 0;
        }

        @Override
        public String toString() {
            // TODO: return readable text about this item, e.g.
            // Book{id='B001', title='Clean Code', borrowed=false}

            return null;
        }
    }
}

