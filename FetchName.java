package in.qadir.exucutor.futures;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String>
{
    private final String name;
    public FetchName(String name)
    {
        this.name =  name;
    }

    public String call() throws Exception
    {
        System.out.printf("Getting full name of %s from server\n", name);
        Thread.sleep((4000));
        return name + " bye!";
    }
}