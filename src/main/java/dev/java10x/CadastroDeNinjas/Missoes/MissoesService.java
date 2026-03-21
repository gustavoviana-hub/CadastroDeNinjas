package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    public Optional<MissoesModel> listarMissoesPorId(Long id) {
        return missoesRepository.findById(id);
    }

    public MissoesModel criarMissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }

    public boolean deletarMissaoPorId(Long id) {
        if (!missoesRepository.existsById(id)) return false;
        missoesRepository.deleteById(id);
        return true;
    }
}