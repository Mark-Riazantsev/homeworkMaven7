public class ManagerFilm {

        private FilmReprository repo;

        public ManagerFilm(FilmReprository repo) {
            this.repo = repo;
        }

        public void add(Films item) {
            repo.save(item);
        }

        public Films[] getItems() {
            Films[] all = repo.getItems();
            Films[] reversed = new Films[all.length];
            for (int i = 0; i < reversed.length; i++) {
                reversed[i] = all[all.length - 1 - i];
            }
            return reversed;
        }

        public int getTotal() {
            int sum = 0;
            for (Films item : repo.getItems()) {
                sum = sum + item.getCount() * item.getProductPrice();
            }
            return sum;
        }
    }

