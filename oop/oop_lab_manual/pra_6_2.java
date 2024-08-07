//not completed

class book
{
    protected String author_name;

    public void get_name(String n)
    {
        this.author_name = n;
    }

    public void display(){}

    public void get_title(String n){}
}

class book_publication extends book
{
    protected String title;

    public void get_title(String n)
    {
        this.title = n;
    }

    public void display()
    {
        System.out.println("the book's author name is : " + author_name + " and the book title is : " + title);
    }
}

class paper_publication extends book
{
    protected String title;

    public void get_title(String n)
    {
        this.title = n;
    }

    public void display()
    {
        System.out.println("the book's author name is : " + author_name + " and the paper title is : " + title);
    }
}

public class pra_6_2 
{
    public static void main(String[] args)
    {
        book b = null;

        book_publication bp = new book_publication();
        paper_publication pp = new paper_publication();

        b=bp;
        b.get_name(args[0]);
        b.get_title(args[1]);
        b.display();

        b=pp;
        b.get_name(args[2]);
        b.get_title(args[3]);
        b.display();
    }
}
