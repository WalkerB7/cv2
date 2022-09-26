package models.dataSaver;

public class FileDataSaver<T> implements DataSaver<T>{
    private T data;

    @Override
    public void save (T data){
        System.out.println("Saved");
        this.data = data;
    }

    @Override
    public T load(){
        return data;
    }
}
