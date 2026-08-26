package dev.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.guardrail.OutputGuardrail;
import dev.langchain4j.guardrail.OutputGuardrailResult;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ToneGuardRail implements OutputGuardrail {

    @Inject
    ToneJudge judge; // Inject the ToneJudge bean

    @Override
    public OutputGuardrailResult validate(AiMessage aiMessage) {
        if(!judge.isProfessional(aiMessage.text()))
            return reprompt(aiMessage.text(), """
                    Sua resposta foi detectada como rude ou informal demais.
                    Reescreva-a mantendo o polidez e formalidade de um agente de viagens sênior.  
                """);
        return OutputGuardrailResult.success();
    }
}
