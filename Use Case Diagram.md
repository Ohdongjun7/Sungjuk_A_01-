```mermaid
graph LR
    %% Actors
    Professor((교수))

    subgraph "(성적 관리 시스템)"
        %% Use Cases
        UC_Input(성적입력)
        UC_Check(교수체크)
        UC_Search(학점조회)

        %% Relationships: Include
        UC_Input -.->|<< include >>| UC_Check
        UC_Search -.->|<< include >>| UC_Check
    end

    %% Actor Connections
    Professor --> UC_Input
    Professor --> UC_Search