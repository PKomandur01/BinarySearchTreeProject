/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public interface Tree <E> extends Iterable <E>
{
	public boolean search(E e);
	public boolean insert(E e, Article a);
	public boolean delete(E e);
	public void inorder();
	public void postorder();
	public void preorder();
	public int getSize();
	public boolean isEmpty();
}
