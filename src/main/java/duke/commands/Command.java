package duke.commands;

import duke.tasktypes.TaskList;
import duke.Ui;
import duke.Storage;

public abstract class Command {
    public abstract void execute(TaskList taskList, Ui ui, Storage storage);
}