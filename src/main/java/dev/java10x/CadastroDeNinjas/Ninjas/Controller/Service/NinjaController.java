package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinja() {
        return "Mostra Ninja";
    }

    // Mostrar Ninjas por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID() {
        return "Ninja deletado por ID";
    }

}
