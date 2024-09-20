package com.example.cardpio.Listeners;

import com.example.cardpio.Models.InstructionsResponse;

import java.util.List;

public interface InstructionsListenner {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);
}
