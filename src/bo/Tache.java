package bo;

public class Tache {
    private String [] todo;
    private int count;
    private String description;




    // generation des setter
    public void setTodo(String[] todo) {
        this.todo = todo;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getsize(){
        return count;
    }

    // Creation des differentes methodes


    //---------Ajouter une Tache-----
    public boolean ajouterTache(String element) {
        if (this.count == this.todo.length) {
            return false;  //si la liste est deja pleine
        }else {
            this.todo[count] = element;
            this.count++;
            return true;
        }
    }


    //--------Supprimer une tache------
    public String supprimerTache(int index){
        if (index<1 || index>this.count){
            return null; // aucun element
        }else{
            index--;
            String deleted = this.todo[index];
            for(int i = index; i<this.count - 1; i++){
                this.todo[i] = this.todo[i+1];
            }
            this.count--; // pour supprimer juste un element
            return deleted;
        }
    }


    //-------




}
