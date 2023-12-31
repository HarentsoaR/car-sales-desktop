PGDMP     7                	    {           gestionVoitures    14.5    14.4 !               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    81983    gestionVoitures    DATABASE     r   CREATE DATABASE "gestionVoitures" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_Madagascar.1252';
 !   DROP DATABASE "gestionVoitures";
                postgres    false            �            1259    81984    client    TABLE     {   CREATE TABLE public.client (
    id bigint NOT NULL,
    number character varying(255),
    name character varying(255)
);
    DROP TABLE public.client;
       public         heap    postgres    false            �            1259    81989 	   client_id    SEQUENCE     ~   CREATE SEQUENCE public.client_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999999999
    CACHE 1;
     DROP SEQUENCE public.client_id;
       public          postgres    false    209                       0    0 	   client_id    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.client_id OWNED BY public.client.id;
          public          postgres    false    210            �            1259    81999    commande    TABLE     �   CREATE TABLE public.commande (
    id bigint NOT NULL,
    idclient bigint,
    idvoiture bigint,
    date date NOT NULL,
    numerocommande character varying(255),
    quantity bigint
);
    DROP TABLE public.commande;
       public         heap    postgres    false            �            1259    82004    commande_id    SEQUENCE     �   CREATE SEQUENCE public.commande_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 999999999999999999
    CACHE 1;
 "   DROP SEQUENCE public.commande_id;
       public          postgres    false    213                       0    0    commande_id    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.commande_id OWNED BY public.commande.id;
          public          postgres    false    214            �            1259    90209    users    TABLE     w   CREATE TABLE public.users (
    id bigint,
    username character varying(255),
    password character varying(255)
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    106607    users_id    SEQUENCE     v   CREATE SEQUENCE public.users_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 9999999
    CACHE 1;
    DROP SEQUENCE public.users_id;
       public          postgres    false    215                       0    0    users_id    SEQUENCE OWNED BY     9   ALTER SEQUENCE public.users_id OWNED BY public.users.id;
          public          postgres    false    216            �            1259    81992    voiture    TABLE     �   CREATE TABLE public.voiture (
    id bigint NOT NULL,
    number character varying(255),
    design character varying(255),
    pu bigint,
    stock bigint
);
    DROP TABLE public.voiture;
       public         heap    postgres    false            �            1259    81997 
   voiture_id    SEQUENCE        CREATE SEQUENCE public.voiture_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999999999
    CACHE 1;
 !   DROP SEQUENCE public.voiture_id;
       public          postgres    false    211                       0    0 
   voiture_id    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.voiture_id OWNED BY public.voiture.id;
          public          postgres    false    212            k           2604    106609 	   client id    DEFAULT     b   ALTER TABLE ONLY public.client ALTER COLUMN id SET DEFAULT nextval('public.client_id'::regclass);
 8   ALTER TABLE public.client ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    210    209            m           2604    106658    commande id    DEFAULT     f   ALTER TABLE ONLY public.commande ALTER COLUMN id SET DEFAULT nextval('public.commande_id'::regclass);
 :   ALTER TABLE public.commande ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    213            n           2604    106608    users id    DEFAULT     `   ALTER TABLE ONLY public.users ALTER COLUMN id SET DEFAULT nextval('public.users_id'::regclass);
 7   ALTER TABLE public.users ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    215            l           2604    106623 
   voiture id    DEFAULT     d   ALTER TABLE ONLY public.voiture ALTER COLUMN id SET DEFAULT nextval('public.voiture_id'::regclass);
 9   ALTER TABLE public.voiture ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    212    211                      0    81984    client 
   TABLE DATA           2   COPY public.client (id, number, name) FROM stdin;
    public          postgres    false    209   L!                 0    81999    commande 
   TABLE DATA           [   COPY public.commande (id, idclient, idvoiture, date, numerocommande, quantity) FROM stdin;
    public          postgres    false    213   �!                 0    90209    users 
   TABLE DATA           7   COPY public.users (id, username, password) FROM stdin;
    public          postgres    false    215   8"                 0    81992    voiture 
   TABLE DATA           @   COPY public.voiture (id, number, design, pu, stock) FROM stdin;
    public          postgres    false    211   �"                  0    0 	   client_id    SEQUENCE SET     9   SELECT pg_catalog.setval('public.client_id', 119, true);
          public          postgres    false    210                       0    0    commande_id    SEQUENCE SET     :   SELECT pg_catalog.setval('public.commande_id', 94, true);
          public          postgres    false    214                       0    0    users_id    SEQUENCE SET     7   SELECT pg_catalog.setval('public.users_id', 11, true);
          public          postgres    false    216                       0    0 
   voiture_id    SEQUENCE SET     9   SELECT pg_catalog.setval('public.voiture_id', 27, true);
          public          postgres    false    212            p           2606    106611    client Client_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.client
    ADD CONSTRAINT "Client_pkey" PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.client DROP CONSTRAINT "Client_pkey";
       public            postgres    false    209            t           2606    106660    commande commande_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.commande
    ADD CONSTRAINT commande_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.commande DROP CONSTRAINT commande_pkey;
       public            postgres    false    213            r           2606    106625    voiture voiture_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.voiture
    ADD CONSTRAINT voiture_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.voiture DROP CONSTRAINT voiture_pkey;
       public            postgres    false    211            v           2606    106678    commande client    FK CONSTRAINT     z   ALTER TABLE ONLY public.commande
    ADD CONSTRAINT client FOREIGN KEY (idclient) REFERENCES public.client(id) NOT VALID;
 9   ALTER TABLE ONLY public.commande DROP CONSTRAINT client;
       public          postgres    false    213    3184    209            u           2606    106669    commande voiture    FK CONSTRAINT     }   ALTER TABLE ONLY public.commande
    ADD CONSTRAINT voiture FOREIGN KEY (idvoiture) REFERENCES public.voiture(id) NOT VALID;
 :   ALTER TABLE ONLY public.commande DROP CONSTRAINT voiture;
       public          postgres    false    211    3186    213               _   x�5�;� E���bc$H9 ш��ٺ����$7����r�XY�-2���&ɱ$!��0�����sO�J�q��֐}�������9���         m   x�e�;�0�9�(��&sY�@���$E���l[&!щ�����h��?�%DC�BBe�ھ��H宣G%QR]�ֱZSKjA�wy�� �"F/�[�k]���#`         l   x�U�A�0Dѵ�0����t�X�����""�^��3����E-����wp���|��7M�Ƽ��	\�I���T�r��?;���x�iI5a9Qt�p0��� p Q%5Y         �   x�=��
�0F������h[/C���:��ϱ�M��rB�i�왔�JuS�\��߀V�`:��)�&VY@w)ʡ L�����\E������XT�\�78�������4f����K��rx�)Gʞ6.BK��_�МRk��@�[|?�/�0�     