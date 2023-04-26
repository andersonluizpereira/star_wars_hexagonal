#Este projeto serve como base para o projeto de estudo de arquitetura hexagonal
#Onde usamos a API do StarWars para buscar os planetas e salvar no banco de dados e postar em um topico do kafka
#O projeto esta dividido em 3 camadas
1-) Adapter - onde fica a camada de entrada e saida de dados
2-) Core - onde fica a camada de dominio
3-) Config - onde fica as configuracoes do projeto