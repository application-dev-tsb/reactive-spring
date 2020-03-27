create table srj_account
(
    id bigserial not null constraint srj_account_pkey primary key,
    password varchar(255),
    username varchar(255) constraint uk_username unique,
    authorities jsonb
);

create table srj_candidate_search
(
    id bigserial not null constraint srj_candidate_search_pkey primary key,
    name varchar(255)
);




