// Samuel Ueno Fernandes - RA: 2678314
import java.util.ArrayList;
import java.util.List;

public class BDAcessorios {

    private List<Acessorio> bdAcessorios = new ArrayList<>();
    private static BDAcessorios instancia;

    private BDAcessorios() {}

    //MÉTODO SINGLETON
    public static BDAcessorios getInstancia() {
        if (instancia == null) {
            instancia = new BDAcessorios();
        }
        return instancia;
    }

    public List<Acessorio> getBdAcessorios() {
        return bdAcessorios;
    }

    // 1. INSERÇÃO (CREATE)
    public Acessorio cadastrarAcessorio(Acessorio acessorio) throws Exception {
        if(buscarAcessorio(acessorio.getCodigo()) != null) {
            throw new Exception("Acessório com este código já cadastrado.");
        }
        if (acessorio.getPreco() <= 0) {
            // Reutilizando a exceção que já tínhamos
            throw new AcessorioInvalidoException("Preço do acessório deve ser maior que zero");
        }
        bdAcessorios.add(acessorio);
        return acessorio;
    }

    // 2. CONSULTA (READ)
    public Acessorio buscarAcessorio(String codigo) {
        for (Acessorio acessorio : bdAcessorios) {
            if (acessorio.getCodigo().equalsIgnoreCase(codigo)) {
                return acessorio;
            }
        }
        return null;
    }

    // 3. ALTERAÇÃO (UPDATE)
    public Acessorio alterarAcessorio(Acessorio acessorioAtualizado) throws Exception {
        Acessorio acessorioOriginal = buscarAcessorio(acessorioAtualizado.getCodigo());
        if (acessorioOriginal == null) {
            throw new Exception("Acessório não encontrado para alteração");
        }
        // Substitui o objeto antigo pelo novo
        int indice = bdAcessorios.indexOf(acessorioOriginal);
        bdAcessorios.set(indice, acessorioAtualizado);
        return acessorioAtualizado;
    }

    // 4. EXCLUSÃO (DELETE)
    public void excluirAcessorio(String codigo) throws Exception {
        Acessorio acessorio = buscarAcessorio(codigo);
        if (acessorio == null) {
            throw new Exception("Acessório não encontrado para exclusão");
        }
        bdAcessorios.remove(acessorio);
    }
}