import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TasksTest {
    @Test
    public void shouldFindSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotFindSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("маме");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Молоко");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotFindEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Сыр");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMeeting1() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMeeting2() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMeeting1() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("2");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMeeting2() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Сайт");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

}
