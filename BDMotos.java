// Samuel Ueno Fernandes - RA: 2678314
import java.util.ArrayList;
import java.util.List;

public class BDMotos {

    private List<Motocicleta> bdMotos = new ArrayList<>();
    private static BDMotos instancia;

    private BDMotos() {
        // Construtor privado para garantir que ninguém de fora possa instanciar
    }

    //MÉTODO SINGLETON
    public static BDMotos getInstancia() {
        if (instancia == null) {
            instancia = new BDMotos();
        }
        return instancia;
    }

    public List<Motocicleta> getBdMotos() {
        return bdMotos;
    }

    // 1. INSERÇÃO (CREATE)
    public Motocicleta cadastrarMoto(Motocicleta moto)
            throws MotoJaCadastradaException, MotoSemProprietarioException, MotoSemPrecoException {
        
        if (buscarMoto(moto.getCodigo()) != null) {
            throw new MotoJaCadastradaException("ERRO: Moto com código " + moto.getCodigo() + " já está cadastrada");
        }
        bdMotos.add(moto);
        return moto;
    }

    // 2. CONSULTA (READ)
    public Motocicleta buscarMoto(String codigo) {
        for (Motocicleta moto : bdMotos) {
            if (moto.getCodigo().equalsIgnoreCase(codigo)) {
                return moto;
            }
        }
        return null;
    }
    
    // 3. ALTERAÇÃO (UPDATE)
    public Motocicleta alterarMoto(Motocicleta motoAtualizada) throws Exception {
        Motocicleta motoOriginal = buscarMoto(motoAtualizada.getCodigo());
        if (motoOriginal == null) {
            throw new Exception("Moto não encontrada para alteração");
        }
        bdMotos.remove(motoOriginal);
        bdMotos.add(motoAtualizada);
        return motoAtualizada;
    }
    // 4. EXCLUSÃO (DELETE)
    public void excluirMoto(String codigo) throws Exception {
        Motocicleta moto = buscarMoto(codigo);
        if (moto == null) {
            throw new Exception("Moto não encontrada para exclusão");
        }
        bdMotos.remove(moto);
    }
}

