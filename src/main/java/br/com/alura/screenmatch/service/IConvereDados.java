package br.com.alura.screenmatch.service;

public interface IConvereDados  {

    <T> T obterDados(String json, Class<T> classe);
}
