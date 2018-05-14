
/* Drop Tables */

DROP TABLE IF EXISTS kerberos.LINE_PROPERTY_M;




/* Create Tables */

-- LINEプロパティマスタ
CREATE TABLE kerberos.LINE_PROPERTY_M
(
	line_prop_id serial NOT NULL,
	app_key text NOT NULL UNIQUE,
	-- この値を指定することにより、LINEプラットフォームから認可コードが返されます。
	response_type text DEFAULT 'code' NOT NULL,
	-- チャネルID。LINEが発行した、チャネル固有の識別子。
	client_id text NOT NULL,
	-- コールバックURL。認証と認可の後にユーザーがリダイレクトされるURLです。コンソールでチャネル向けに登録したコールバックURLと一致する必要があります。
	redirect_uri text NOT NULL,
	-- クロスサイトリクエストフォージェリ防止用の固有な英数字の文字列。アプリ側でランダムに生成する必要があります。URLエンコードされた文字列は使用できません。
	state_val text NOT NULL,
	-- ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。詳しくは、「スコープ」を参照してください。ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。
	-- profile：ユーザーのプロフィール情報を取得する権限です。
	-- openid：IDトークンを取得する権限です。詳しくは、「IDトークン」を参照してください。
	-- email：ユーザーのメールアドレスを取得する権限です。openidを同時に指定する必要があります。詳しくは、「IDトークン」を参照してください。
	scope_val text NOT NULL,
	-- リプレイアタックを防止するための文字列。この値はレスポンスで返されるIDトークンに含まれます。
	nonce text,
	-- consent。ユーザーが要求された権限をすべて付与済みであっても、強制的に同意画面を表示します。
	prompt text,
	-- ボットを友だち追加するオプションをユーザーのログイン時に表示します。normalまたはaggressiveを指定します。詳しくは、「ボットをLINEログインのチャネルにリンクする」を参照してください。
	bot_prompt text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	-- チャネルシークレット
	client_secret text NOT NULL,
	-- authorization_code
	grant_type text DEFAULT 'authorization_code。付与タイプを指定します。' NOT NULL,
	PRIMARY KEY (line_prop_id)
) WITHOUT OIDS;



/* Comments */

COMMENT ON TABLE kerberos.LINE_PROPERTY_M IS 'LINEプロパティマスタ';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.response_type IS 'この値を指定することにより、LINEプラットフォームから認可コードが返されます。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.client_id IS 'チャネルID。LINEが発行した、チャネル固有の識別子。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.redirect_uri IS 'コールバックURL。認証と認可の後にユーザーがリダイレクトされるURLです。コンソールでチャネル向けに登録したコールバックURLと一致する必要があります。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.state_val IS 'クロスサイトリクエストフォージェリ防止用の固有な英数字の文字列。アプリ側でランダムに生成する必要があります。URLエンコードされた文字列は使用できません。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.scope_val IS 'ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。詳しくは、「スコープ」を参照してください。ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。
profile：ユーザーのプロフィール情報を取得する権限です。
openid：IDトークンを取得する権限です。詳しくは、「IDトークン」を参照してください。
email：ユーザーのメールアドレスを取得する権限です。openidを同時に指定する必要があります。詳しくは、「IDトークン」を参照してください。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.nonce IS 'リプレイアタックを防止するための文字列。この値はレスポンスで返されるIDトークンに含まれます。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.prompt IS 'consent。ユーザーが要求された権限をすべて付与済みであっても、強制的に同意画面を表示します。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.bot_prompt IS 'ボットを友だち追加するオプションをユーザーのログイン時に表示します。normalまたはaggressiveを指定します。詳しくは、「ボットをLINEログインのチャネルにリンクする」を参照してください。';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.client_secret IS 'チャネルシークレット';
COMMENT ON COLUMN kerberos.LINE_PROPERTY_M.grant_type IS 'authorization_code';



