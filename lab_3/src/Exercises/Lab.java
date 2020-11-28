package Exercises;

import Utils.Reader;
import Utils.Writer;

public abstract class Lab implements IExercise{

    protected final Reader reader;
    protected final Writer writer;

    public Lab(){
        reader = new Reader();
        writer = new Writer();
    }
}
