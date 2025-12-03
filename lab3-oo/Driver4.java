public class Driver4 {

    public static void main(String[] args) throws SubjectException {

        Subject[] subjects = new Subject[6];

        Maths m1 = new Maths();
        m1.setRoom("The White House");
        m1.setTutor("D. Trump");
        subjects[0] = m1;

        //art has the option to take room and tutor
        Art art1 = new Art("101","Bruce Wayne");
        subjects[1] = art1;

        Languages lang1 = new Languages();
        lang1.setRoom("102");
        lang1.setTutor("Steve Jobs");
        subjects[2] = lang1;

        Geography geo1 = new Geography();
        geo1.setRoom("103");
        geo1.setTutor("Bill Gates");
        subjects[3] = geo1;

        History hist1 = new History();
        hist1.setRoom("104");
        hist1.setTutor("George Washington");
        subjects[4] = hist1;

        Physics phys1 = new Physics();
        phys1.setRoom("105");
        phys1.setTutor("Isaac Newton");
        subjects[5] = phys1;

        printSubjects(subjects);
    }


        public static void printSubjects(Subject[] subjects) throws SubjectException {
            for (Subject s : subjects) {

                if (s.getRoom() == null || s.getRoom().isBlank()) {
                    throw new NoRoomException(s.getName());
                }

                if (s.getTutor() == null || s.getTutor().isBlank()) {
                    throw new NoTutorException(s.getName());
                }

                System.out.println(
                        s.getName() + " " +
                                s.getTutor() + " " +
                                s.getRoom() + " " +
                                s.getCredits() + " " +
                                s.getDescription()
                );
            }
        }
    }

