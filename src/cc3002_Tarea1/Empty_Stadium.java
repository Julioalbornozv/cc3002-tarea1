package cc3002_Tarea1;

public class Empty_Stadium extends Abs_Stadium {
	/*Contains no instructions, does nothing to the battlefield
	 */
	private Judge monitor;
	
	@Override
	public void execute(Judge m, ICard c) {
		this.monitor = m;
		c.accept(this);
		}

}
