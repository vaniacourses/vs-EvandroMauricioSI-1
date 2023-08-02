package main;

import java.util.ArrayList;
import java.util.List;

public class MonitorarEnchentes {
    public void executarMonitoramento() {

        GerenciarTermos gerenciarTermos = new GerenciarTermos();
        List<String> termosRelacionados = gerenciarTermos.buscarTermosRelacionados();


        String enderecoConexao = "endereco_da_rede_social";
        String chaveAcesso = "chave_de_acesso_da_rede_social";


        ColetaPostFacebook coletaPostFacebook = new ColetaPostFacebook();
        List<Post> posts = coletaPostFacebook.coletaPosts();


        List<Post> postsFiltrados = filtrarPosts(posts, termosRelacionados);
        
        List<Post> postsRefinados = refinarPosts(postsFiltrados);


        if (!postsRefinados.isEmpty()) {
          
            comunicarAgenciasEmergencia(postsRefinados);

            
            enderecoConexao = "endereco_da_rede_social";
            chaveAcesso = "chave_de_acesso_da_rede_social";

        }

    }

    // Implementação dos métodos auxiliares (filtros, refinamento, comunicação)
    private List<Post> filtrarPosts(List<Post> posts, List<String> termos) {
        List<Post> postsFiltrados = new ArrayList<>();
        for (Post post : posts) {
            for (String termo : termos) {
                if (post.getConteudo().toLowerCase().contains(termo.toLowerCase())) {
                    postsFiltrados.add(post);
                    break;
                }
            }
        }
        return postsFiltrados;
    }

    private List<Post> refinarPosts(List<Post> posts) {

        return posts;
    }

    private void comunicarAgenciasEmergencia(List<Post> posts) {

    }
}

class Post {
    private String data;
    private String conteudo;
    private String usuario;
    private double latitude;
    private double longitude;

    public Post(String data, String conteudo, String usuario, double latitude, double longitude) {
        this.data = data;
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getData() {
        return data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getUsuario() {
        return usuario;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

