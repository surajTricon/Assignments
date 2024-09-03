import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
public class StudentSorting {
    public static <T> void sortStudents(ArrayList<Student> students, Comparator<T> comparator, Function<Student, T> getter) {
        Collections.sort(students, new StudentComparator<>(comparator, getter));
    }

    private static class StudentComparator<T> implements Comparator<Student> {
        private Comparator<T> comparator;
        private Function<Student, T> getter;

        public StudentComparator(Comparator<T> comparator, Function<Student, T> getter) {
            this.comparator = comparator;
            this.getter = getter;
        }

        @Override
        public int compare(Student s1, Student s2) {
            T value1 = getter.apply(s1);
            T value2 = getter.apply(s2);
            return comparator.compare(value1, value2);
        }
    }
    }