public class Video implements Acoes{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.views = views;
        this.curtidas = curtidas;
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }

    public int getViews(){
        return this.views;
    }

    public void setViews(int views){
        this.views = views;
    }

    public int getCurtidas(){
        return this.curtidas;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo(){
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }

    
    @Override
    public void play() {
        if(!this.reproduzindo){
            this.reproduzindo = true;
            System.out.println("Video is now playing");
        }else{
            System.out.println("Video is already playing");
        }

    }

    @Override
    public void pause() {
        if(this.reproduzindo){
            this.reproduzindo = false;
            System.out.println("Video paused");
        }else{
            System.out.println("Video is already paused");
        }
        
    }

    @Override
    public void like() {
        this.curtidas++;
        System.out.println("Liked!");
        
    }

    @Override
    public String toString()[
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + 
               ",views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}'
    ]
}