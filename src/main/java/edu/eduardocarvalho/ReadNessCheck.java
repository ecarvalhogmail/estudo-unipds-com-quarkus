package edu.eduardocarvalho;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class ReadNessCheck implements HealthCheck {

    @RestClient
    StarWarsServices starWarsServices;

    @Override
    public HealthCheckResponse call() {

        if(starWarsServices.getStarships().contains(StarWarsServices.MSG_ERROR)){
            return HealthCheckResponse.down("NÃO Estou pronto!!!");
        }else{
        return HealthCheckResponse.up("ESTOU PRONTO");
        }
    }
}
