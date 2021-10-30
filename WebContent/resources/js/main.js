'use strict'

const openModal = () => document.getElementById('modal')
    .classList.add('active')

const closeModal = () => document.getElementById('modal')
    .classList.remove('active')

const tempCLiente = {
nome: "Adjair Nascimento",
email: "adjair.nascimento.204010@gmail.com",
celular: "61 9 99633909",
cidade: "Sobradinho II - DF"
}

// CRUD

const createCLient = (client) => {
    const db_client = []
    db.client.push (client)
    localStorage.setItem("db_client", JSON.stringify(db_client))
}
 
//Eventos
document.getElementById('cadastrarCliente')
    .addEventListener('click', openModal)

document.getElementById('modalClose')
    .addEventListener('click', closeModal)