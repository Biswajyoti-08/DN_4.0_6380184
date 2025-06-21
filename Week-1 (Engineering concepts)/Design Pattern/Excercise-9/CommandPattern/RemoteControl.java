public class RemoteControl {
    Command obj;

     public void setCommand(Command command) {
        this.obj = command;
    }
  public void pressButton() {
        if (obj != null) {
            obj.execute();
        } else {
            System.out.println("No command assigned.");
        }
    }
}