package inheritance.multiple;

//class C extends A, B { // won't compile

class C extends A  {
	public void bar() {
		super.foo();
	}
}