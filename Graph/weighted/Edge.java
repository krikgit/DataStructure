package undirectional.weighted;

public class Edge {
	
	private int src;
	private int dst;
	private int wtg;
	
	public Edge(int src, int dst, int wtg) {
		this.src = src;
		this.dst = dst;
		this.wtg = wtg;
	}

	public int getSrc() {
		return src;
	}

	public void setSrc(int src) {
		this.src = src;
	}

	public int getDst() {
		return dst;
	}

	public void setDst(int dst) {
		this.dst = dst;
	}

	public int getWtg() {
		return wtg;
	}

	public void setWtg(int wtg) {
		this.wtg = wtg;
	}
	
}
