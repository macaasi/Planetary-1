package com.looptrace.planetary.Listeners;

public interface GetPlanetListener {

    void OnSuccess();

    void OnFailure(String s);

    void OnThrowableError(Throwable throwable);
}
