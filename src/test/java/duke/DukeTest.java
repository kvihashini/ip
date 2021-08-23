package duke;

import duke.tasktypes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DukeTest {
    @Test
    public void dummyTest(){
        assertEquals(2, 2);
    }

    @Test
    public void createToDoAndMarkAsDone() {
        Task toDo = new ToDos("paint on book");
        toDo.markAsDone();
        assertEquals(toDo.toString(), "[T][X] paint on book");
    }

    @Test
    public void createEventAndMarkAsDone() {
        Task event = new Events("birthday party", "2001-01-01");
        event.markAsDone();
        assertEquals(event.toString(), "[E][X] birthday party (at: Jan 1 2001)");
    }

    @Test
    public void createDeadline() {
        Deadlines deadline = new Deadlines("exam book", "2021-12-31");
        assertEquals(deadline.toString(), "[D][ ] exam book (by: Dec 31 2021)");
    }

}