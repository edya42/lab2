package lab2;

class list {
	public int x;
	public list y;
	public list(int x, list y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Element:" + this.x;
	}
}

class MyList {
	int counter = 0;
	public list first = null;
	public list last = null;
	public MyList(){}
	public void add(int x){
		if(counter == 0){
			list L = new list(x,null);
			first = L;
			last = L;
		}
		if(counter > 0){
			list L = new list(x,null);
			last.y = L;
			last = L;
		}
		counter = counter + 1;		
	}
	public String toString(){
		list L = first;
		for (int i=0; i <counter;i++){
			System.out.println(L);
			L = L.y;
		}
	return "";
	}
	public int get(int t){
		if( t < 0 ||  t > counter - 1 ){
			System.out.println("Get is out of range");
			return 0;
		}
		else{
			list L = first;
			for (int i=0; i < t ;i++){
				L = L.y;
			}
			return L.x;
		}
		
	}
}

public class lab2 {
	public static void main(String[] args) {
	MyList a = new MyList();
	a.add(3);
	a.add(4);
	a.add(5);
	System.out.println(a);
	System.out.println(a.get(3));
	}

}
