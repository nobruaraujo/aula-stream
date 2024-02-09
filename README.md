# Conceitos de Java Stream

- **Operações Intermediárias:** Transformam ou manipulam os elementos de um fluxo sem produzir um resultado final imediato, criando um novo fluxo encadeável.
  - Exemplos incluem `filter`, `map`, `sorted`, `distinct`, `limit`, `skip`, entre outros.
- **Operações Terminais:** Produzem um resultado final ou efeito final no fluxo, consumindo-o.
  - Exemplos incluem `forEach`, `reduce`, `collect`, `min`, `max`, `anyMatch`, `allMatch`, `noneMatch`, entre outros.

Além disso, conceitos específicos de operações de Stream:
- **Filter:** Filtra os elementos de um fluxo com base em um critério especificado.
- **Map:** Transforma cada elemento de um fluxo aplicando uma função a ele.
- **Match:** Verifica se os elementos de um fluxo atendem a uma condição específica.
- **Min:** Encontra o menor elemento de um fluxo com base em um comparador.
- **Max:** Encontra o maior elemento de um fluxo com base em um comparador.
- **Reduce:** Combina todos os elementos de um fluxo em um único resultado usando uma operação de redução.
